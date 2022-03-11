// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.datasync.enums.LocationObjectStorageServerProtocol;
import io.pulumi.awsnative.datasync.inputs.LocationObjectStorageTagArgs;
import io.pulumi.core.Output;
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
      private final @Nullable Output<String> accessKey;

    public Output<String> getAccessKey() {
        return this.accessKey == null ? Output.empty() : this.accessKey;
    }

    /**
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * 
     */
    @InputImport(name="agentArns", required=true)
      private final Output<List<String>> agentArns;

    public Output<List<String>> getAgentArns() {
        return this.agentArns;
    }

    /**
     * The name of the bucket on the self-managed object storage server.
     * 
     */
    @InputImport(name="bucketName", required=true)
      private final Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName;
    }

    /**
     * Optional. The secret key is used if credentials are required to access the self-managed object storage server.
     * 
     */
    @InputImport(name="secretKey")
      private final @Nullable Output<String> secretKey;

    public Output<String> getSecretKey() {
        return this.secretKey == null ? Output.empty() : this.secretKey;
    }

    /**
     * The name of the self-managed object storage server. This value is the IP address or Domain Name Service (DNS) name of the object storage server.
     * 
     */
    @InputImport(name="serverHostname", required=true)
      private final Output<String> serverHostname;

    public Output<String> getServerHostname() {
        return this.serverHostname;
    }

    /**
     * The port that your self-managed server accepts inbound network traffic on.
     * 
     */
    @InputImport(name="serverPort")
      private final @Nullable Output<Integer> serverPort;

    public Output<Integer> getServerPort() {
        return this.serverPort == null ? Output.empty() : this.serverPort;
    }

    /**
     * The protocol that the object storage server uses to communicate.
     * 
     */
    @InputImport(name="serverProtocol")
      private final @Nullable Output<LocationObjectStorageServerProtocol> serverProtocol;

    public Output<LocationObjectStorageServerProtocol> getServerProtocol() {
        return this.serverProtocol == null ? Output.empty() : this.serverProtocol;
    }

    /**
     * The subdirectory in the self-managed object storage server that is used to read data from.
     * 
     */
    @InputImport(name="subdirectory")
      private final @Nullable Output<String> subdirectory;

    public Output<String> getSubdirectory() {
        return this.subdirectory == null ? Output.empty() : this.subdirectory;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<LocationObjectStorageTagArgs>> tags;

    public Output<List<LocationObjectStorageTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public LocationObjectStorageArgs(
        @Nullable Output<String> accessKey,
        Output<List<String>> agentArns,
        Output<String> bucketName,
        @Nullable Output<String> secretKey,
        Output<String> serverHostname,
        @Nullable Output<Integer> serverPort,
        @Nullable Output<LocationObjectStorageServerProtocol> serverProtocol,
        @Nullable Output<String> subdirectory,
        @Nullable Output<List<LocationObjectStorageTagArgs>> tags) {
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
        this.accessKey = Output.empty();
        this.agentArns = Output.empty();
        this.bucketName = Output.empty();
        this.secretKey = Output.empty();
        this.serverHostname = Output.empty();
        this.serverPort = Output.empty();
        this.serverProtocol = Output.empty();
        this.subdirectory = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationObjectStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessKey;
        private Output<List<String>> agentArns;
        private Output<String> bucketName;
        private @Nullable Output<String> secretKey;
        private Output<String> serverHostname;
        private @Nullable Output<Integer> serverPort;
        private @Nullable Output<LocationObjectStorageServerProtocol> serverProtocol;
        private @Nullable Output<String> subdirectory;
        private @Nullable Output<List<LocationObjectStorageTagArgs>> tags;

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

        public Builder accessKey(@Nullable Output<String> accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = Output.ofNullable(accessKey);
            return this;
        }

        public Builder agentArns(Output<List<String>> agentArns) {
            this.agentArns = Objects.requireNonNull(agentArns);
            return this;
        }

        public Builder agentArns(List<String> agentArns) {
            this.agentArns = Output.of(Objects.requireNonNull(agentArns));
            return this;
        }

        public Builder bucketName(Output<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Output.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder secretKey(@Nullable Output<String> secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        public Builder secretKey(@Nullable String secretKey) {
            this.secretKey = Output.ofNullable(secretKey);
            return this;
        }

        public Builder serverHostname(Output<String> serverHostname) {
            this.serverHostname = Objects.requireNonNull(serverHostname);
            return this;
        }

        public Builder serverHostname(String serverHostname) {
            this.serverHostname = Output.of(Objects.requireNonNull(serverHostname));
            return this;
        }

        public Builder serverPort(@Nullable Output<Integer> serverPort) {
            this.serverPort = serverPort;
            return this;
        }

        public Builder serverPort(@Nullable Integer serverPort) {
            this.serverPort = Output.ofNullable(serverPort);
            return this;
        }

        public Builder serverProtocol(@Nullable Output<LocationObjectStorageServerProtocol> serverProtocol) {
            this.serverProtocol = serverProtocol;
            return this;
        }

        public Builder serverProtocol(@Nullable LocationObjectStorageServerProtocol serverProtocol) {
            this.serverProtocol = Output.ofNullable(serverProtocol);
            return this;
        }

        public Builder subdirectory(@Nullable Output<String> subdirectory) {
            this.subdirectory = subdirectory;
            return this;
        }

        public Builder subdirectory(@Nullable String subdirectory) {
            this.subdirectory = Output.ofNullable(subdirectory);
            return this;
        }

        public Builder tags(@Nullable Output<List<LocationObjectStorageTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<LocationObjectStorageTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public LocationObjectStorageArgs build() {
            return new LocationObjectStorageArgs(accessKey, agentArns, bucketName, secretKey, serverHostname, serverPort, serverProtocol, subdirectory, tags);
        }
    }
}
