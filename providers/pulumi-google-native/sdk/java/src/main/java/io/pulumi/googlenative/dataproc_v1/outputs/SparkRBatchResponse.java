// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SparkRBatchResponse {
    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    private final List<String> archiveUris;
    /**
     * Optional. The arguments to pass to the Spark driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    private final List<String> args;
    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    private final List<String> fileUris;
    /**
     * The HCFS URI of the main R file to use as the driver. Must be a .R or .r file.
     * 
     */
    private final String mainRFileUri;

    @CustomType.Constructor
    private SparkRBatchResponse(
        @CustomType.Parameter("archiveUris") List<String> archiveUris,
        @CustomType.Parameter("args") List<String> args,
        @CustomType.Parameter("fileUris") List<String> fileUris,
        @CustomType.Parameter("mainRFileUri") String mainRFileUri) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.mainRFileUri = mainRFileUri;
    }

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
    */
    public List<String> getArchiveUris() {
        return this.archiveUris;
    }
    /**
     * Optional. The arguments to pass to the Spark driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
    */
    public List<String> getArgs() {
        return this.args;
    }
    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
    */
    public List<String> getFileUris() {
        return this.fileUris;
    }
    /**
     * The HCFS URI of the main R file to use as the driver. Must be a .R or .r file.
     * 
    */
    public String getMainRFileUri() {
        return this.mainRFileUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkRBatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> archiveUris;
        private List<String> args;
        private List<String> fileUris;
        private String mainRFileUri;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkRBatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.mainRFileUri = defaults.mainRFileUri;
        }

        public Builder archiveUris(List<String> archiveUris) {
            this.archiveUris = Objects.requireNonNull(archiveUris);
            return this;
        }
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }
        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder fileUris(List<String> fileUris) {
            this.fileUris = Objects.requireNonNull(fileUris);
            return this;
        }
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }
        public Builder mainRFileUri(String mainRFileUri) {
            this.mainRFileUri = Objects.requireNonNull(mainRFileUri);
            return this;
        }        public SparkRBatchResponse build() {
            return new SparkRBatchResponse(archiveUris, args, fileUris, mainRFileUri);
        }
    }
}
