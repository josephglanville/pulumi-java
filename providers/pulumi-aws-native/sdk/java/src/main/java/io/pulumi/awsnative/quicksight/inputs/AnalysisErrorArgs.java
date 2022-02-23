// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.enums.AnalysisErrorType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>A metadata error structure for an analysis.</p>
 * 
 */
public final class AnalysisErrorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalysisErrorArgs Empty = new AnalysisErrorArgs();

    /**
     * <p>The message associated with the analysis error.</p>
     * 
     */
    @InputImport(name="message")
      private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    @InputImport(name="type")
      private final @Nullable Input<AnalysisErrorType> type;

    public Input<AnalysisErrorType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public AnalysisErrorArgs(
        @Nullable Input<String> message,
        @Nullable Input<AnalysisErrorType> type) {
        this.message = message;
        this.type = type;
    }

    private AnalysisErrorArgs() {
        this.message = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> message;
        private @Nullable Input<AnalysisErrorType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisErrorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setType(@Nullable Input<AnalysisErrorType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable AnalysisErrorType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public AnalysisErrorArgs build() {
            return new AnalysisErrorArgs(message, type);
        }
    }
}
