#language:en
@Regresion
Feature: Contabilizar cada imagen parecida dentro de un conjunto en Evalart
  Como un usuario
  Quiero ingresar a evalart
  Para resolver cada ejercicio

  @CasoDePrueba1
  Scenario Outline: Resolver Problemas de imagenes y Fechas
    Given que Luisa ingresa a Evalart
    When Inicia Sesion con las credenciales
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    And Resuelve cada incognita propuesta

    Then Verifica el codigo Hash
      | hash   |
      | <hash> |

    Examples:
      | usuario | contrasena                                       | hash                                                      |
      | 825027  | 10df2f32286b7120MS00LTcyMDUyOA==30e0c83e6c29f1c3 | <General>c2fe0e21ce445033MS00LTcyMDUyOA==df63afbf4da3d4b1 |




