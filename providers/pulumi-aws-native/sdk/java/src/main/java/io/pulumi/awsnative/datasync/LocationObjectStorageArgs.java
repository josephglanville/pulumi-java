// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.datasync.enums.LocationObjectStorageServerProtocol;
import io.pulumi.awsnative.datasync.inputs.LocationObjectStorageTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationObjectStorageArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationObjectStorageArgs Empty = new LocationObjectStorageArgs();

    /**
     * Optional. The access key is used if credentials are required to access the self-managed object storage server.
     * 
     */
    @InputImport(name="accessKey")
      private final @Nullable Input<String> accessKey;

    public Input<String> getAccessKey() {
        return this.accessKey == null ? Input.empty() : this.accessKey;
    }

    /**
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * 
     */
    @InputImport(name="agentArns", required=true)
      private final Input<List<String>> agentArns;

    public Input<List<String>> getAgentArns() {
        return this.agentArns;
    }

    /**
     * The name of the bucket on the self-managed object storage server.
     * 
     */
    @InputImport(name="bucketName", required=true)
      private final Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName;
    }

    /**
     * Optional. The secret key is used if credentials are required to access the self-managed object storage server.
     * 
     */
    @InputImport(name="secretKey")
      private final @Nullable Input<String> secretKey;

    public Input<String> getSecretKey() {
        return this.secretKey == null ? Input.empty() : this.secretKey;
    }

    /**
     * The name of the self-managed object storage server. This value is the IP address or Domain Name Service (DNS) name of the object storage server.
     * 
     */
    @InputImport(name="serverHostname", required=true)
      private final Input<String> serverHostname;

    public Input<String> getServerHostname() {
        return this.serverHostname;
    }

    /**
     * The port that your self-managed server accepts inbound network traffic on.
     * 
     */
    @InputImport(name="serverPort")
      private final @Nullable Input<Integer> serverPort;

    public Input<Integer> getServerPort() {
        return this.serverPort == null ? Input.empty() : this.serverPort;
    }

    /**
     * The protocol that the object storage server uses to communicate.
     * 
     */
    @InputImport(name="serverProtocol")
      private final @Nullable Input<LocationObjectStorageServerProtocol> serverProtocol;

    public Input<LocationObjectStorageServerProtocol> getServerProtocol() {
        return this.serverProtocol == null ? Input.empty() : this.serverProtocol;
    }

    /**
     * The subdirectory in the self-managed object storage server that is used to read data from.
     * 
     */
    @InputImport(name="subdirectory")
      private final @Nullable Input<String> subdirectory;

    public Input<String> getSubdirectory() {
        return this.subdirectory == null ? Input.empty() : this.subdirectory;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<LocationObjectStorageTagArgs>> tags;

    public Input<List<LocationObjectStorageTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LocationObjectStorageArgs(
        @Nullable Input<String> accessKey,
        Input<List<String>> agentArns,
        Input<String> bucketName,
        @Nullable Input<String> secretKey,
        Input<String> serverHostname,
        @Nullable Input<Integer> serverPort,
        @Nullable Input<LocationObjectStorageServerProtocol> serverProtocol,
        @Nullable Input<String> subdirectory,
        @Nullable Input<List<LocationObjectStorageTagArgs>> tags) {
        this.accessKey = accessKey;
        this.agentArns = Objects.requireNonNull(agentArns, "expected parameter 'agentArns' to be non-null");
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.secretKey = secretKey;
        this.serverHostname = Objects.requireNonNull(serverHostname, "expected parameter 'serverHostname' to be non-null");
        this.serverPort = serverPort;
        this.serverProtocol = serverProtocol;
        this.subdirectory = subdirectory;
        this.tags = tags;
    }

    private LocationObjectStorageArgs() {
        this.accessKey = Input.empty();
        this.agentArns = Input.empty();
        this.bucketName = Input.empty();
        this.secretKey = Input.empty();
        this.serverHostname = Input.empty();
        this.serverPort = Input.empty();
        this.serverProtocol = Input.empty();
        this.subdirectory = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationObjectStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessKey;
        private Input<List<String>> agentArns;
        private Input<String> bucketName;
        private @Nullable Input<String> secretKey;
        private Input<String> serverHostname;
        private @Nullable Input<Integer> serverPort;
        private @Nullable Input<LocationObjectStorageServerProtocol> serverProtocol;
        private @Nullable Input<String> subdirectory;
        private @Nullable Input<List<LocationObjectStorageTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationObjectStorageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.agentArns = defaults.agentArns;
    	      this.bucketName = defaults.bucketName;
    	      this.secretKey = defaults.secretKey;
    	      this.serverHostname = defaults.serverHostname;
    	      this.serverPort = defaults.serverPort;
    	      this.serverProtocol = defaults.serverProtocol;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
        }

        public Builder setAccessKey(@Nullable Input<String> accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder setAccessKey(@Nullable String accessKey) {
            this.accessKey = Input.ofNullable(accessKey);
            return this;
        }

        public Builder setAgentArns(Input<List<String>> agentArns) {
            this.agentArns = Objects.requireNonNull(agentArns);
            return this;
        }

        public Builder setAgentArns(List<String> agentArns) {
            this.agentArns = Input.of(Objects.requireNonNull(agentArns));
            return this;
        }

        public Builder setBucketName(Input<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Input.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder setSecretKey(@Nullable Input<String> secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        public Builder setSecretKey(@Nullable String secretKey) {
            this.secretKey = Input.ofNullable(secretKey);
            return this;
        }

        public Builder setServerHostname(Input<String> serverHostname) {
            this.serverHostname = Objects.requireNonNull(serverHostname);
            return this;
        }

        public Builder setServerHostname(String serverHostname) {
            this.serverHostname = Input.of(Objects.requireNonNull(serverHostname));
            return this;
        }

        public Builder setServerPort(@Nullable Input<Integer> serverPort) {
            this.serverPort = serverPort;
            return this;
        }

        public Builder setServerPort(@Nullable Integer serverPort) {
            this.serverPort = Input.ofNullable(serverPort);
            return this;
        }

        public Builder setServerProtocol(@Nullable Input<LocationObjectStorageServerProtocol> serverProtocol) {
            this.serverProtocol = serverProtocol;
            return this;
        }

        public Builder setServerProtocol(@Nullable LocationObjectStorageServerProtocol serverProtocol) {
            this.serverProtocol = Input.ofNullable(serverProtocol);
            return this;
        }

        public Builder setSubdirectory(@Nullable Input<String> subdirectory) {
            this.subdirectory = subdirectory;
            return this;
        }

        public Builder setSubdirectory(@Nullable String subdirectory) {
            this.subdirectory = Input.ofNullable(subdirectory);
            return this;
        }

        public Builder setTags(@Nullable Input<List<LocationObjectStorageTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<LocationObjectStorageTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LocationObjectStorageArgs build() {
            return new LocationObjectStorageArgs(accessKey, agentArns, bucketName, secretKey, serverHostname, serverPort, serverProtocol, subdirectory, tags);
        }
    }
}
