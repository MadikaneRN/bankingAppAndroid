package cput.ac.za.bankingapp.repository;

import android.test.AndroidTestCase;
import junit.framework.Assert;
import java.util.Set;

import cput.ac.za.bankingapp.domain.Login;
import cput.ac.za.bankingapp.repository.login.LoginRepository;
import cput.ac.za.bankingapp.repository.login.impl.LoginRepositoryImpl;

/**
 * Created by Scorpian on 2016-04-24.
 */
public class LoginRepositoryTest extends AndroidTestCase {

    private static final String TAG = "LOGIN TEST";
    private Long id;

    public void testCreateReadUpdate() throws Exception
    {
        LoginRepository repo = new LoginRepositoryImpl(this.getContext());
        // CREATE
        Login createEntity = new Login.Builder()
                .userName("MadikaneRN")
                .passWord("madikane")
                .build();
        Login insertedEntity = repo.save(createEntity);
        id = insertedEntity.getId();
        Assert.assertNotNull(TAG + " CREATE ", insertedEntity);

        //READ ENTITY
        Login entity = repo.findById(id);
        Assert.assertNotNull(TAG + "READ ENTITY", entity);

        //READ ALL
        Set< Login> clients = repo.findAll();
        Assert.assertTrue(TAG+ "READ ENTITY",clients.size() >0);

        //UPDATE ENTITY
        Login updateEntity = new Login.Builder()
                .copy(entity)
                .passWord("subzero")
                .build();

        repo.update(updateEntity);
        Login newEntity = repo.findById(id);
        Assert.assertEquals(TAG + "UPDATE ENTITY", "subzero",newEntity.getPassWord());

        //DELTE ENTITY
        repo.delete(updateEntity);
        Login deleteEntity = repo.findById(id);
        Assert.assertNull(TAG +"DELETE", deleteEntity);

        repo.deleteAll();

    }



}
