// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class BucketReplicationTimeValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationTimeValueArgs Empty = new BucketReplicationTimeValueArgs();

    @InputImport(name="minutes", required=true)
      private final Input<Integer> minutes;

    public Input<Integer> getMinutes() {
        return this.minutes;
    }

    public BucketReplicationTimeValueArgs(Input<Integer> minutes) {
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
    }

    private BucketReplicationTimeValueArgs() {
        this.minutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationTimeValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> minutes;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationTimeValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
        }

        public Builder setMinutes(Input<Integer> minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }

        public Builder setMinutes(Integer minutes) {
            this.minutes = Input.of(Objects.requireNonNull(minutes));
            return this;
        }
        public BucketReplicationTimeValueArgs build() {
            return new BucketReplicationTimeValueArgs(minutes);
        }
    }
}
