// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketNotificationFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the AWS Lambda functions to invoke and the events for which to invoke them.
 * 
 */
public final class BucketLambdaConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLambdaConfigurationArgs Empty = new BucketLambdaConfigurationArgs();

    /**
     * The Amazon S3 bucket event for which to invoke the AWS Lambda function.
     * 
     */
    @InputImport(name="event", required=true)
      private final Input<String> event;

    public Input<String> getEvent() {
        return this.event;
    }

    /**
     * The filtering rules that determine which objects invoke the AWS Lambda function.
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Input<BucketNotificationFilterArgs> filter;

    public Input<BucketNotificationFilterArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3 invokes when the specified event type occurs.
     * 
     */
    @InputImport(name="function", required=true)
      private final Input<String> function;

    public Input<String> getFunction() {
        return this.function;
    }

    public BucketLambdaConfigurationArgs(
        Input<String> event,
        @Nullable Input<BucketNotificationFilterArgs> filter,
        Input<String> function) {
        this.event = Objects.requireNonNull(event, "expected parameter 'event' to be non-null");
        this.filter = filter;
        this.function = Objects.requireNonNull(function, "expected parameter 'function' to be non-null");
    }

    private BucketLambdaConfigurationArgs() {
        this.event = Input.empty();
        this.filter = Input.empty();
        this.function = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLambdaConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> event;
        private @Nullable Input<BucketNotificationFilterArgs> filter;
        private Input<String> function;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLambdaConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.filter = defaults.filter;
    	      this.function = defaults.function;
        }

        public Builder setEvent(Input<String> event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }

        public Builder setEvent(String event) {
            this.event = Input.of(Objects.requireNonNull(event));
            return this;
        }

        public Builder setFilter(@Nullable Input<BucketNotificationFilterArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable BucketNotificationFilterArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setFunction(Input<String> function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }

        public Builder setFunction(String function) {
            this.function = Input.of(Objects.requireNonNull(function));
            return this;
        }
        public BucketLambdaConfigurationArgs build() {
            return new BucketLambdaConfigurationArgs(event, filter, function);
        }
    }
}
