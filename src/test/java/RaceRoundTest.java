import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RaceRoundTest {

    @Test
    @DisplayName("RaceRound 생성_Exception Test")
    public void RaceRound_Constructor_Test(){
        //given
        RaceRound race = RaceRound.of(2);

        assertThat(race.getValue()).isEqualTo(2);
        //when
        assertThatThrownBy(()->{
            RaceRound.of(-1);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("라운드는 양수여야 합니다.");
        //then
    }
}