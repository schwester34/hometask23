package allureExample;

import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;

public class AllureTestExample{

    @AllureId("10863")
    @Test
    @DisplayName("Авторизация Google")
    @Tags({@Tag("WEB"), @Tag("BLOCKER"), @Tag("AUTOMATED")})
    void testGoogleAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Google");
        step("Авторизуемся как пользователь", () -> {
            step("Ввести логин login");
            step("Ввести пароль password");
        });
        step("Нажать кнопку Войти");
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Google", () -> {
            step("Логин login");
            step("Пароль password");
        });
        step("Нажать кнопку Выйти");
    }

    @Test
    @AllureId("10870")
    @DisplayName("Авторизация GitHub")
    @Tags({@Tag("WEB"), @Tag("BLOCKER"), @Tag("AUTOMATED")})
    void testGitHubAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через GitHub");
        step("Авторизуемся как пользователь", () -> {
            step("Ввести логин login");
            step("Ввести пароль password");
        });
        step("Нажать кнопку Войти");
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из GitHub", () -> {
            step("Логин login");
            step("Пароль password");
        });
        step("Нажать кнопку Выйти");
    }

    @Test
    @AllureId("10871")
    @DisplayName("Авторизация FaceBook")
    @Tags({@Tag("WEB"), @Tag("BLOCKER"), @Tag("AUTOMATED")})
    void testFaceBookAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через FaceBook");
        step("Авторизуемся как пользователь", () -> {
            step("Ввести логин login");
            step("Ввести пароль password");
        });
        step("Нажать кнопку Войти");
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из FaceBook", () -> {
            step("Логин login");
            step("Пароль password");
        });
        step("Нажать кнопку Выйти");
    }

}
