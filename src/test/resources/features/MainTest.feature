# language: ru

Функционал: Поиск товара на сайте с последующим добавлением его в корзину

  Сценарий: Добавление и удаление товаров в корзину
    Дано Открываем страницу интернет-магазина 'Зоопассаж'
    Тогда Ищем товар с названием "Сухой корм Royal Canin Hypoallergenic DR21 диета для собак"
    Затем Проверяем, что найден только один товар
    И Выбираем вес товара "2" кг и добавляем в корзину
    Тогда Переходим в корзину
    И Проверяем, что в корзине требуемое количество 1 товара "Сухой корм Royal Canin Hypoallergenic DR21 диета для собак 2 кг"
    Тогда Удалим позицию "Сухой корм Royal Canin Hypoallergenic DR21 диета для собак 2 кг" из корзины
