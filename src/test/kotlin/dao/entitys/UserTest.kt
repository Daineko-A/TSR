package dao.entitys

import org.jboss.arquillian.container.test.api.Deployment
import org.jboss.arquillian.junit.Arquillian
import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.asset.EmptyAsset
import org.jboss.shrinkwrap.api.spec.JavaArchive
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(Arquillian::class)
class UserTest {

    @org.junit.Test
    fun getFirstName() {
    }

    @org.junit.Test
    fun setFirstName() {
    }

    @org.junit.Test
    fun getLastName() {
    }

    @org.junit.Test
    fun setLastName() {
    }

    @org.junit.Test
    fun getAccountName() {
    }

    @org.junit.Test
    fun setAccountName() {
    }

    @org.junit.Test
    fun getId() {
    }

    @org.junit.Test
    fun setId() {
    }

    companion object {
        @Deployment
        fun createDeployment(): JavaArchive {
            return ShrinkWrap.create(JavaArchive::class.java)
                .addClass(User::class.java)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
        }
    }
}
