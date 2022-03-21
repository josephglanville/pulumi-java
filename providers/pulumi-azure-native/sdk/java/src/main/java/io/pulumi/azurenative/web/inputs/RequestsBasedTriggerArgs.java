// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trigger based on total requests.
 * 
 */
public final class RequestsBasedTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final RequestsBasedTriggerArgs Empty = new RequestsBasedTriggerArgs();

    /**
     * Request Count.
     * 
     */
    @Import(name="count")
      private final @Nullable Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count == null ? Output.empty() : this.count;
    }

    /**
     * Time interval.
     * 
     */
    @Import(name="timeInterval")
      private final @Nullable Output<String> timeInterval;

    public Output<String> getTimeInterval() {
        return this.timeInterval == null ? Output.empty() : this.timeInterval;
    }

    public RequestsBasedTriggerArgs(
        @Nullable Output<Integer> count,
        @Nullable Output<String> timeInterval) {
        this.count = count;
        this.timeInterval = timeInterval;
    }

    private RequestsBasedTriggerArgs() {
        this.count = Output.empty();
        this.timeInterval = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestsBasedTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> count;
        private @Nullable Output<String> timeInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestsBasedTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.timeInterval = defaults.timeInterval;
        }

        public Builder count(@Nullable Output<Integer> count) {
            this.count = count;
            return this;
        }
        public Builder count(@Nullable Integer count) {
            this.count = Output.ofNullable(count);
            return this;
        }
        public Builder timeInterval(@Nullable Output<String> timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Builder timeInterval(@Nullable String timeInterval) {
            this.timeInterval = Output.ofNullable(timeInterval);
            return this;
        }        public RequestsBasedTriggerArgs build() {
            return new RequestsBasedTriggerArgs(count, timeInterval);
        }
    }
}
