/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkAuthAzureSAS {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkAuthAzureSAS(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkAuthAzureSAS obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkAuthAzureSAS(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkAuthAzureSAS() {
    this(chilkatJNI.new_CkAuthAzureSAS(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkAuthAzureSAS_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkAuthAzureSAS_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkAuthAzureSAS_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_AccessKey(CkString str) {
    chilkatJNI.CkAuthAzureSAS_get_AccessKey(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String accessKey() {
    return chilkatJNI.CkAuthAzureSAS_accessKey(swigCPtr, this);
  }

  public void put_AccessKey(String newVal) {
    chilkatJNI.CkAuthAzureSAS_put_AccessKey(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkAuthAzureSAS_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkAuthAzureSAS_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkAuthAzureSAS_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkAuthAzureSAS_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkAuthAzureSAS_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkAuthAzureSAS_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkAuthAzureSAS_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkAuthAzureSAS_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkAuthAzureSAS_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkAuthAzureSAS_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkAuthAzureSAS_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public void get_StringToSign(CkString str) {
    chilkatJNI.CkAuthAzureSAS_get_StringToSign(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String stringToSign() {
    return chilkatJNI.CkAuthAzureSAS_stringToSign(swigCPtr, this);
  }

  public void put_StringToSign(String newVal) {
    chilkatJNI.CkAuthAzureSAS_put_StringToSign(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkAuthAzureSAS_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkAuthAzureSAS_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkAuthAzureSAS_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkAuthAzureSAS_version(swigCPtr, this);
  }

  public void Clear() {
    chilkatJNI.CkAuthAzureSAS_Clear(swigCPtr, this);
  }

  public boolean GenerateToken(CkString outStr) {
    return chilkatJNI.CkAuthAzureSAS_GenerateToken(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String generateToken() {
    return chilkatJNI.CkAuthAzureSAS_generateToken(swigCPtr, this);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkAuthAzureSAS_SaveLastError(swigCPtr, this, path);
  }

  public boolean SetNonTokenParam(String name, String value) {
    return chilkatJNI.CkAuthAzureSAS_SetNonTokenParam(swigCPtr, this, name, value);
  }

  public boolean SetTokenParam(String name, String authParamName, String value) {
    return chilkatJNI.CkAuthAzureSAS_SetTokenParam(swigCPtr, this, name, authParamName, value);
  }

}
