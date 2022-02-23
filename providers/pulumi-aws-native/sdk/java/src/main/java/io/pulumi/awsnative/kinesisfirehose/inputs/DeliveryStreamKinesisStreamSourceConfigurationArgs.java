// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DeliveryStreamKinesisStreamSourceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamKinesisStreamSourceConfigurationArgs Empty = new DeliveryStreamKinesisStreamSourceConfigurationArgs();

    @InputImport(name="kinesisStreamARN", required=true)
      private final Input<String> kinesisStreamARN;

    public Input<String> getKinesisStreamARN() {
        return this.kinesisStreamARN;
    }

    @InputImport(name="roleARN", required=true)
      private final Input<String> roleARN;

    public Input<String> getRoleARN() {
        return this.roleARN;
    }

    public DeliveryStreamKinesisStreamSourceConfigurationArgs(
        Input<String> kinesisStreamARN,
        Input<String> roleARN) {
        this.kinesisStreamARN = Objects.requireNonNull(kinesisStreamARN, "expected parameter 'kinesisStreamARN' to be non-null");
        this.roleARN = Objects.requireNonNull(roleARN, "expected parameter 'roleARN' to be non-null");
    }

    private DeliveryStreamKinesisStreamSourceConfigurationArgs() {
        this.kinesisStreamARN = Input.empty();
        this.roleARN = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamKinesisStreamSourceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kinesisStreamARN;
        private Input<String> roleARN;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamKinesisStreamSourceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kinesisStreamARN = defaults.kinesisStreamARN;
    	      this.roleARN = defaults.roleARN;
        }

        public Builder setKinesisStreamARN(Input<String> kinesisStreamARN) {
            this.kinesisStreamARN = Objects.requireNonNull(kinesisStreamARN);
            return this;
        }

        public Builder setKinesisStreamARN(String kinesisStreamARN) {
            this.kinesisStreamARN = Input.of(Objects.requireNonNull(kinesisStreamARN));
            return this;
        }

        public Builder setRoleARN(Input<String> roleARN) {
            this.roleARN = Objects.requireNonNull(roleARN);
            return this;
        }

        public Builder setRoleARN(String roleARN) {
            this.roleARN = Input.of(Objects.requireNonNull(roleARN));
            return this;
        }
        public DeliveryStreamKinesisStreamSourceConfigurationArgs build() {
            return new DeliveryStreamKinesisStreamSourceConfigurationArgs(kinesisStreamARN, roleARN);
        }
    }
}
