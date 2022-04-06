// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codestarconnections;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * The Amazon Resource Name (ARN) of the host associated with the connection. Conflicts with `provider_type`
     * 
     */
    @Import(name="hostArn")
      private final @Nullable Output<String> hostArn;

    public Output<String> getHostArn() {
        return this.hostArn == null ? Output.empty() : this.hostArn;
    }

    /**
     * The name of the connection to be created. The name must be unique in the calling AWS account. Changing `name` will create a new resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The name of the external provider where your third-party code repository is configured. Valid values are `Bitbucket`, `GitHub` or `GitHubEnterpriseServer`. Changing `provider_type` will create a new resource. Conflicts with `host_arn`
     * 
     */
    @Import(name="providerType")
      private final @Nullable Output<String> providerType;

    public Output<String> getProviderType() {
        return this.providerType == null ? Output.empty() : this.providerType;
    }

    /**
     * Map of key-value resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ConnectionArgs(
        @Nullable Output<String> hostArn,
        @Nullable Output<String> name,
        @Nullable Output<String> providerType,
        @Nullable Output<Map<String,String>> tags) {
        this.hostArn = hostArn;
        this.name = name;
        this.providerType = providerType;
        this.tags = tags;
    }

    private ConnectionArgs() {
        this.hostArn = Output.empty();
        this.name = Output.empty();
        this.providerType = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostArn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> providerType;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostArn = defaults.hostArn;
    	      this.name = defaults.name;
    	      this.providerType = defaults.providerType;
    	      this.tags = defaults.tags;
        }

        public Builder hostArn(@Nullable Output<String> hostArn) {
            this.hostArn = hostArn;
            return this;
        }
        public Builder hostArn(@Nullable String hostArn) {
            this.hostArn = Output.ofNullable(hostArn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder providerType(@Nullable Output<String> providerType) {
            this.providerType = providerType;
            return this;
        }
        public Builder providerType(@Nullable String providerType) {
            this.providerType = Output.ofNullable(providerType);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ConnectionArgs build() {
            return new ConnectionArgs(hostArn, name, providerType, tags);
        }
    }
}