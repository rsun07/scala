package pers.xiaoming.scala.basic_learning.generic_type

import org.junit.Test

class GenericTypeDemo {
  val ferrariF1Car1:FerrariF1 = new FerrariF1("MikeJohn", 300)
  val ferrariF1Car2:FerrariF1 = new FerrariF1("Montoya", 290)
  val redBullF1Car1:RedBullF1 = new RedBullF1("Veltter", 310)
  val f1TestCar:F1Car = new F1Car("Test Driver 1", 200)
  val jeep:Jeep = new Jeep("Jeep Driver", 160)

  @Test
  def upperBoundsDemo {
    Competition.F1CarRace(ferrariF1Car1, ferrariF1Car2)
    Competition.F1CarRace(ferrariF1Car1, redBullF1Car1)
    Competition.F1CarRace(ferrariF1Car1, f1TestCar)

    // Error
    // Competition.F1CarRace(f1TestCar, jeep)
  }

  @Test
  def lowerBoundsDemo {
    Competition.ferrariTestFieldRun(ferrariF1Car1)
    Competition.ferrariTestFieldRun(f1TestCar)
    Competition.ferrariTestFieldRun(redBullF1Car1)
    Competition.ferrariTestFieldRun(jeep)
  }


  //Scala covariant(+), contravariant(-)
  @Test
  def covariantDemo {
    val carLicense = new License[Car]
    val f1CarLicense = new License[F1Car]
    val jeepLicense = new License[Jeep]

    LicenseChecker.checkLicense(carLicense)
    LicenseChecker.checkLicense(f1CarLicense)
    LicenseChecker.checkLicense(jeepLicense)

    val carCovariantLicense = new CovariantLicense[Car]
    val JeepCovariantLicense = new CovariantLicense[Jeep]
    val F1CarCovariantLicense = new CovariantLicense[F1Car]
    val FerrariCovariantLicense = new CovariantLicense[FerrariF1]

    // error
    // LicenseChecker.covariantLicense(carCovariantLicense)
    // LicenseChecker.covariantLicense(JeepCovariantLicense)
    LicenseChecker.covariantLicense(F1CarCovariantLicense)
    LicenseChecker.covariantLicense(FerrariCovariantLicense)

    val carContravariantLicense = new ContravariantLicense[Car]
    val jeepContravariantLicense = new ContravariantLicense[Jeep]
    val F1CarContravariantLicense = new ContravariantLicense[F1Car]
    val ferrariContravariantLicense = new ContravariantLicense[FerrariF1]

    LicenseChecker.contravariantLicense(carContravariantLicense)
    // LicenseChecker.contravariantLicense(jeepContravariantLicense)
    LicenseChecker.contravariantLicense(F1CarContravariantLicense)
    // LicenseChecker.contravariantLicense(ferrariContravariantLicense)
  }
}
