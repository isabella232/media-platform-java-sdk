package com.wix.mediaplatform.v8.service;

public class Destination {

    private String path;

    private String directory;

    private FileDescriptor.Acl acl = FileDescriptor.Acl.PRIVATE;

    private FileLifecycle lifecycle;

    public Destination() {
    }

    public String getPath() {
        return path;
    }

    public Destination setPath(String path) {
        this.path = path;
        return this;
    }

    public String getDirectory() {
        return directory;
    }

    public Destination setDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    public FileDescriptor.Acl getAcl() {
        return acl;
    }

    public Destination setAcl(FileDescriptor.Acl acl) {
        this.acl = acl;
        return this;
    }

    public FileLifecycle getLifecycle() {
        return lifecycle;
    }

    public Destination setLifecycle(FileLifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    @Deprecated
    public FileLifecycle getFileLifecycle() {
        return lifecycle;
    }

    @Deprecated
    public Destination setFileLifecycle(FileLifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
}
