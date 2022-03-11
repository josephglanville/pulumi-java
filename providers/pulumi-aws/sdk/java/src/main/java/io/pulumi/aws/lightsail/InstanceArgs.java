// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The Availability Zone in which to create your
     * instance (see list below)
     * 
     */
    @InputImport(name="availabilityZone", required=true)
      private final Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
     * 
     */
    @InputImport(name="blueprintId", required=true)
      private final Output<String> blueprintId;

    public Output<String> getBlueprintId() {
        return this.blueprintId;
    }

    /**
     * The bundle of specification information (see list below)
     * 
     */
    @InputImport(name="bundleId", required=true)
      private final Output<String> bundleId;

    public Output<String> getBundleId() {
        return this.bundleId;
    }

    /**
     * The name of your key pair. Created in the
     * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
     * 
     */
    @InputImport(name="keyPairName")
      private final @Nullable Output<String> keyPairName;

    public Output<String> getKeyPairName() {
        return this.keyPairName == null ? Output.empty() : this.keyPairName;
    }

    /**
     * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * launch script to configure server with additional user data
     * 
     */
    @InputImport(name="userData")
      private final @Nullable Output<String> userData;

    public Output<String> getUserData() {
        return this.userData == null ? Output.empty() : this.userData;
    }

    public InstanceArgs(
        Output<String> availabilityZone,
        Output<String> blueprintId,
        Output<String> bundleId,
        @Nullable Output<String> keyPairName,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> userData) {
        this.availabilityZone = Objects.requireNonNull(availabilityZone, "expected parameter 'availabilityZone' to be non-null");
        this.blueprintId = Objects.requireNonNull(blueprintId, "expected parameter 'blueprintId' to be non-null");
        this.bundleId = Objects.requireNonNull(bundleId, "expected parameter 'bundleId' to be non-null");
        this.keyPairName = keyPairName;
        this.name = name;
        this.tags = tags;
        this.userData = userData;
    }

    private InstanceArgs() {
        this.availabilityZone = Output.empty();
        this.blueprintId = Output.empty();
        this.bundleId = Output.empty();
        this.keyPairName = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.userData = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> availabilityZone;
        private Output<String> blueprintId;
        private Output<String> bundleId;
        private @Nullable Output<String> keyPairName;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> userData;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.blueprintId = defaults.blueprintId;
    	      this.bundleId = defaults.bundleId;
    	      this.keyPairName = defaults.keyPairName;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.userData = defaults.userData;
        }

        public Builder availabilityZone(Output<String> availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Output.of(Objects.requireNonNull(availabilityZone));
            return this;
        }

        public Builder blueprintId(Output<String> blueprintId) {
            this.blueprintId = Objects.requireNonNull(blueprintId);
            return this;
        }

        public Builder blueprintId(String blueprintId) {
            this.blueprintId = Output.of(Objects.requireNonNull(blueprintId));
            return this;
        }

        public Builder bundleId(Output<String> bundleId) {
            this.bundleId = Objects.requireNonNull(bundleId);
            return this;
        }

        public Builder bundleId(String bundleId) {
            this.bundleId = Output.of(Objects.requireNonNull(bundleId));
            return this;
        }

        public Builder keyPairName(@Nullable Output<String> keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        public Builder keyPairName(@Nullable String keyPairName) {
            this.keyPairName = Output.ofNullable(keyPairName);
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder userData(@Nullable Output<String> userData) {
            this.userData = userData;
            return this;
        }

        public Builder userData(@Nullable String userData) {
            this.userData = Output.ofNullable(userData);
            return this;
        }
        public InstanceArgs build() {
            return new InstanceArgs(availabilityZone, blueprintId, bundleId, keyPairName, name, tags, userData);
        }
    }
}
