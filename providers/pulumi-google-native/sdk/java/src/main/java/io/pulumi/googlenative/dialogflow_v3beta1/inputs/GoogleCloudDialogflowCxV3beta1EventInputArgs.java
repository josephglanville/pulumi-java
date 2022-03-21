// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the event to trigger.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1EventInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1EventInputArgs Empty = new GoogleCloudDialogflowCxV3beta1EventInputArgs();

    /**
     * Name of the event.
     * 
     */
    @Import(name="event")
      private final @Nullable Output<String> event;

    public Output<String> getEvent() {
        return this.event == null ? Output.empty() : this.event;
    }

    public GoogleCloudDialogflowCxV3beta1EventInputArgs(@Nullable Output<String> event) {
        this.event = event;
    }

    private GoogleCloudDialogflowCxV3beta1EventInputArgs() {
        this.event = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1EventInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> event;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1EventInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
        }

        public Builder event(@Nullable Output<String> event) {
            this.event = event;
            return this;
        }
        public Builder event(@Nullable String event) {
            this.event = Output.ofNullable(event);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1EventInputArgs build() {
            return new GoogleCloudDialogflowCxV3beta1EventInputArgs(event);
        }
    }
}
