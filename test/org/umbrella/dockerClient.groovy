import spock.lang.*
import org.umbrella.dockerClient

class dockerClientTest extends Specification {

  def "Docker info test"() {

    given:
    def client = new dockerClient()

    expect: 'Should return docker daemon info'
    client.getInfo() != "error"

  }

}