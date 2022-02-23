// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A model to associate with a detector.
 * 
 */
public final class DetectorModelArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelArgs Empty = new DetectorModelArgs();

    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    public DetectorModelArgs(@Nullable Input<String> arn) {
        this.arn = arn;
    }

    private DetectorModelArgs() {
        this.arn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }
        public DetectorModelArgs build() {
            return new DetectorModelArgs(arn);
        }
    }
}
