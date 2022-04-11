// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoggingRuleHiddenPropertyPathsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingRuleHiddenPropertyPathsArgs Empty = new LoggingRuleHiddenPropertyPathsArgs();

    @Import(name="hiddenPathsOnRequest")
      private final @Nullable Output<List<String>> hiddenPathsOnRequest;

    public Output<List<String>> getHiddenPathsOnRequest() {
        return this.hiddenPathsOnRequest == null ? Codegen.empty() : this.hiddenPathsOnRequest;
    }

    @Import(name="hiddenPathsOnResponse")
      private final @Nullable Output<List<String>> hiddenPathsOnResponse;

    public Output<List<String>> getHiddenPathsOnResponse() {
        return this.hiddenPathsOnResponse == null ? Codegen.empty() : this.hiddenPathsOnResponse;
    }

    public LoggingRuleHiddenPropertyPathsArgs(
        @Nullable Output<List<String>> hiddenPathsOnRequest,
        @Nullable Output<List<String>> hiddenPathsOnResponse) {
        this.hiddenPathsOnRequest = hiddenPathsOnRequest;
        this.hiddenPathsOnResponse = hiddenPathsOnResponse;
    }

    private LoggingRuleHiddenPropertyPathsArgs() {
        this.hiddenPathsOnRequest = Codegen.empty();
        this.hiddenPathsOnResponse = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingRuleHiddenPropertyPathsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> hiddenPathsOnRequest;
        private @Nullable Output<List<String>> hiddenPathsOnResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingRuleHiddenPropertyPathsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hiddenPathsOnRequest = defaults.hiddenPathsOnRequest;
    	      this.hiddenPathsOnResponse = defaults.hiddenPathsOnResponse;
        }

        public Builder hiddenPathsOnRequest(@Nullable Output<List<String>> hiddenPathsOnRequest) {
            this.hiddenPathsOnRequest = hiddenPathsOnRequest;
            return this;
        }
        public Builder hiddenPathsOnRequest(@Nullable List<String> hiddenPathsOnRequest) {
            this.hiddenPathsOnRequest = Codegen.ofNullable(hiddenPathsOnRequest);
            return this;
        }
        public Builder hiddenPathsOnRequest(String... hiddenPathsOnRequest) {
            return hiddenPathsOnRequest(List.of(hiddenPathsOnRequest));
        }
        public Builder hiddenPathsOnResponse(@Nullable Output<List<String>> hiddenPathsOnResponse) {
            this.hiddenPathsOnResponse = hiddenPathsOnResponse;
            return this;
        }
        public Builder hiddenPathsOnResponse(@Nullable List<String> hiddenPathsOnResponse) {
            this.hiddenPathsOnResponse = Codegen.ofNullable(hiddenPathsOnResponse);
            return this;
        }
        public Builder hiddenPathsOnResponse(String... hiddenPathsOnResponse) {
            return hiddenPathsOnResponse(List.of(hiddenPathsOnResponse));
        }        public LoggingRuleHiddenPropertyPathsArgs build() {
            return new LoggingRuleHiddenPropertyPathsArgs(hiddenPathsOnRequest, hiddenPathsOnResponse);
        }
    }
}
