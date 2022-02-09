// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RequestsBasedTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final RequestsBasedTriggerArgs Empty = new RequestsBasedTriggerArgs();

    @InputImport(name="count")
    private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    @InputImport(name="timeInterval")
    private final @Nullable Input<String> timeInterval;

    public Input<String> getTimeInterval() {
        return this.timeInterval == null ? Input.empty() : this.timeInterval;
    }

    public RequestsBasedTriggerArgs(
        @Nullable Input<Integer> count,
        @Nullable Input<String> timeInterval) {
        this.count = count;
        this.timeInterval = timeInterval;
    }

    private RequestsBasedTriggerArgs() {
        this.count = Input.empty();
        this.timeInterval = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestsBasedTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> count;
        private @Nullable Input<String> timeInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestsBasedTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.timeInterval = defaults.timeInterval;
        }

        public Builder setCount(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setTimeInterval(@Nullable Input<String> timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }

        public Builder setTimeInterval(@Nullable String timeInterval) {
            this.timeInterval = Input.ofNullable(timeInterval);
            return this;
        }

        public RequestsBasedTriggerArgs build() {
            return new RequestsBasedTriggerArgs(count, timeInterval);
        }
    }
}
