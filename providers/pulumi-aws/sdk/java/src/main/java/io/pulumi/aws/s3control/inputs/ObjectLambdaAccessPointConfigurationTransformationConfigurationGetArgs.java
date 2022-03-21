// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs Empty = new ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs();

    /**
     * The actions of an Object Lambda Access Point configuration. Valid values: `GetObject`.
     * 
     */
    @Import(name="actions", required=true)
      private final Output<List<String>> actions;

    public Output<List<String>> getActions() {
        return this.actions;
    }

    /**
     * The content transformation of an Object Lambda Access Point configuration. See Content Transformation below for more details.
     * 
     */
    @Import(name="contentTransformation", required=true)
      private final Output<ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationGetArgs> contentTransformation;

    public Output<ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationGetArgs> getContentTransformation() {
        return this.contentTransformation;
    }

    public ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs(
        Output<List<String>> actions,
        Output<ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationGetArgs> contentTransformation) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.contentTransformation = Objects.requireNonNull(contentTransformation, "expected parameter 'contentTransformation' to be non-null");
    }

    private ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs() {
        this.actions = Output.empty();
        this.contentTransformation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> actions;
        private Output<ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationGetArgs> contentTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.contentTransformation = defaults.contentTransformation;
        }

        public Builder actions(Output<List<String>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(List<String> actions) {
            this.actions = Output.of(Objects.requireNonNull(actions));
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        public Builder contentTransformation(Output<ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationGetArgs> contentTransformation) {
            this.contentTransformation = Objects.requireNonNull(contentTransformation);
            return this;
        }
        public Builder contentTransformation(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationGetArgs contentTransformation) {
            this.contentTransformation = Output.of(Objects.requireNonNull(contentTransformation));
            return this;
        }        public ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs build() {
            return new ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs(actions, contentTransformation);
        }
    }
}
