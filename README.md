# "NeWork"


## Дипломная работа курса Нетологии "Android-разработчик с нуля".

### Краткое описание.

В рамках дипломного проекта разработано приложение, в котором пользователи
могут создавать посты и события с медиаресурсами и отмечать их на Яндекс картах, указывать места работы и социальные связи (упоминание в постах, конференциях).

### Инструменты.
- Архитектура MVVM
- Библиотеки:
    - Material Design
    - ROOM
    - OKHTTP
    - Retrofit
    - Hilt
    - LiveData, Flow
    - Coroutines
    - YandexMapsMobile

### Функционал приложения.

- **Регистрация и аутентификация пользователей.**

Пользователи могут ввести свои логин и пароль для входа в аккаунт или создать новую учетную запись, указав имя, будующий логин и пароль для входа.

<img src ="https://github.com/SDVAndroid/Nework_diplom/blob/main/app/src/main/res/screenshots/Screenshot_1.png" width=25% height=25%> <img src ="https://github.com/SDVAndroid/Nework_diplom/blob/main/app/src/main/res/screenshots/Screenshot_2.png" width=25% height=25%>

- **Страница ленты событий.**

Здесь отображается список созданных событий всех аутентифицированных пользователей.
Ключевые возможности данной страницы:
  - Редактирование собственных событий.
  - Просмотр вложенного изображения.
  - Возможность отмечать и не отмечать события, поставив "like/dislike".
  - Возможность подписаться или отписаться от события (с автоматической отметкой в календаре).
  - Просмотр списка спикеров.
  - Просмотр списка поставивших лайки пользователей.
  - Просмотр списка  подписанных на событие пользователей.
  - Просмотр координат события на карте.
  - Возможность делиться контентом данной страницы в других приложениях.

<img src ="https://github.com/SDVAndroid/Nework_diplom/blob/main/app/src/main/res/screenshots/Screenshot_3.png" width=25% height=25%> <img src ="https://github.com/SDVAndroid/Nework_diplom/blob/main/app/src/main/res/screenshots/Screenshot_4.png" width=25% height=25%>

- **Страница ленты постов.**

Здесь отображается список созданных постов всех аутентифицированных пользователей.
Ключевые возможности данной страницы:
- Редактирование собственных постов.
- Просмотр вложенных файлов (изображений, аудио, видео).
- Возможность проставлять "like/dislike".
- Просмотр списка поставивших лайки пользователей.
- Возможность делиться контентом данной страницы в других приложениях.

<img src ="https://github.com/SDVAndroid/Nework_diplom/blob/main/app/src/main/res/screenshots/Screenshot_5.png" width=25% height=25%> <img src ="https://github.com/SDVAndroid/Nework_diplom/blob/main/app/src/main/res/screenshots/Screenshot_6.png" width=25% height=25%><img src ="https://github.com/SDVAndroid/Nework_diplom/blob/main/app/src/main/res/screenshots/Screenshot_11.png" width=25% height=25%>

- **Страница списка пользователей (участников)**

Страница, на которой пользователи могут просматривать других членов сообщества с возможность перехода на профиль пользователя с отображением всех его созданных событий, постов и мест работ.

<img src ="https://github.com/SDVAndroid/Nework_diplom/blob/main/app/src/main/res/screenshots/Screenshot_7.png" width=25% height=25%> <img src ="https://github.com/SDVAndroid/Nework_diplom/blob/main/app/src/main/res/screenshots/Screenshot_8.png" width=25% height=25%>

- **Страница профиля пользователя**

Страница, на которой пользователи могут просматривать информацию о своем профиле, включая свои события, посты, места работ.

<img src ="https://github.com/SDVAndroid/Nework_diplom/blob/main/app/src/main/res/screenshots/Screenshot_9.png" width=25% height=25%><img src ="https://github.com/SDVAndroid/Nework_diplom/blob/main/app/src/main/res/screenshots/Screenshot_10.png" width=25% height=25%>