package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {

    @Test
    @DisplayName("자동차를 입력한 이름의 수 만큼 생성한다.")
    void createCar() {
        String names = "포비,크롱,뽀로로";
        int attemptCount = 3;
        UserInput userInput = new UserInput(names, attemptCount);
        Cars cars = new Cars(userInput);

        assertThat(cars.countCars()).isEqualTo(3);
    }

    @Test
    @DisplayName("원하는 순서의 자동차를 가져올 수 있다.")
    void getCar() {
        String names = "포비,크롱,뽀로로";
        int attemptCount = 3;
        UserInput userInput = new UserInput(names, attemptCount);
        Cars cars = new Cars(userInput);
        Car eachCar = cars.getEachCar(1);
        assertThat(eachCar.getCarName()).isEqualTo("크롱");
    }
}
