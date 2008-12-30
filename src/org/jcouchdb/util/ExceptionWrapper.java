package org.jcouchdb.util;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.httpclient.HttpException;
import org.jcouchdb.exception.CouchDBException;

/**
 * Used to wrap checked exceptions in {@link CouchDBException}s throughout the project.
 * Every checked type wrapped has its own static wrapper method.
 *
 * @author shelmberger
 */
public class ExceptionWrapper
{
    public static CouchDBException wrap(InstantiationException e)
    {
        return new CouchDBException(e);
    }

    public static CouchDBException wrap(IllegalAccessException e)
    {
        return new CouchDBException(e);
    }

    public static CouchDBException wrap(InvocationTargetException e)
    {
        return new CouchDBException(e);
    }

    public static CouchDBException wrap(NoSuchMethodException e)
    {
        return new CouchDBException(e);
    }

    public static CouchDBException wrap(HttpException e)
    {
        return new CouchDBException(e);
    }

    public static CouchDBException wrap(IOException e)
    {
        return new CouchDBException(e);
    }

    public static CouchDBException wrap(ClassNotFoundException e)
    {
        return new CouchDBException(e);
    }

    public static CouchDBException wrap(Exception e)
    {
        return new CouchDBException(e);
    }
}
