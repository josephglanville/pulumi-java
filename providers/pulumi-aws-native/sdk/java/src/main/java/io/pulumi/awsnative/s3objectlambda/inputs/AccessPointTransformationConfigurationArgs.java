// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3objectlambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration to define what content transformation will be applied on which S3 Action.
 * 
 */
public final class AccessPointTransformationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointTransformationConfigurationArgs Empty = new AccessPointTransformationConfigurationArgs();

    @InputImport(name="actions", required=true)
      private final Input<List<String>> actions;

    public Input<List<String>> getActions() {
        return this.actions;
    }

    @InputImport(name="contentTransformation", required=true)
      private final Input<Object> contentTransformation;

    public Input<Object> getContentTransformation() {
        return this.contentTransformation;
    }

    public AccessPointTransformationConfigurationArgs(
        Input<List<String>> actions,
        Input<Object> contentTransformation) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.contentTransformation = Objects.requireNonNull(contentTransformation, "expected parameter 'contentTransformation' to be non-null");
    }

    private AccessPointTransformationConfigurationArgs() {
        this.actions = Input.empty();
        this.contentTransformation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointTransformationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> actions;
        private Input<Object> contentTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointTransformationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.contentTransformation = defaults.contentTransformation;
        }

        public Builder setActions(Input<List<String>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<String> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setContentTransformation(Input<Object> contentTransformation) {
            this.contentTransformation = Objects.requireNonNull(contentTransformation);
            return this;
        }

        public Builder setContentTransformation(Object contentTransformation) {
            this.contentTransformation = Input.of(Objects.requireNonNull(contentTransformation));
            return this;
        }
        public AccessPointTransformationConfigurationArgs build() {
            return new AccessPointTransformationConfigurationArgs(actions, contentTransformation);
        }
    }
}
