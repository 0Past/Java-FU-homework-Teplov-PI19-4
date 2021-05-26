$(document).ready(function () {


    $(document).ready(function () {
        const location = window.location.toString();

        if (location.includes("blogs/Создание.html")) {

            $.ajax({
                url: "http://localhost:8080/tags",
                type: "GET",
                dataType: "json",
                success: function (response) {
                    const element = document.getElementById("post-tags");

                    for (let i = 0; i < response.length; i++) {

                        let opt = document.createElement('option');
                        opt.value = response[i]["id"];
                        opt.innerHTML = response[i]["name"];
                        element.appendChild(opt);
                    }
                },
                error: function (error) {
                    console.log("Tags not response", error);
                }
            });

            //Запрашиваем авторов
            $.ajax({
                url: "http://localhost:8080/users",
                type: "GET",
                dataType: "json",
                success: function (response) {
                    const element = document.getElementById("post-author");
                    for (let i = 0; i < response.length; i++) {
                        let opt = document.createElement('option');
                        opt.value = response[i]["id"];
                        opt.innerHTML = response[i]["login"];
                        element.appendChild(opt);
                    }
                },
                error: function (error) {
                    console.log("Author not response", error);
                }
            });
        }

        //Страница со всеми постами
        else if (location.includes("blogs/all.html")) {

        }

    });

    $("#tag-create-button").click(async function () {

        let postTitleElement = document.getElementById("post-title");
        let postSlugElement = document.getElementById("post-slug");
        let postAuthorElement = document.getElementById("post-author");
        let postTagsElement = document.getElementById("post-tags");
        let postTextElement = document.getElementById("post-text");

        let varData = {
            "authorPost": postAuthorElement.value,
            "slug": postSlugElement.value,
            "text": postTextElement.value,
            "title": postTitleElement.value,
            "tags": postTagsElement.value,
        };

        let response = await fetch("http://localhost:8080/posts", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json;charset=utf-8'
            },
            body: JSON.stringify(varData)
        }, {mode: 'cors'}).then(function (response) {
            console.log(response);

            if (response.status === 401) {
                alert("Only for login users")
            } else if (response.status === 201) {
                alert("Post added")
                postTitleElement.value = "";
                postSlugElement.value = "";
                postAuthorElement.value = "";
                postTagsElement.value = "";
                postTextElement.value = "";
            }

        }).catch(function (error) {
            console.log("Не удалось создать пост", error);
        });
    });

});