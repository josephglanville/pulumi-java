// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.azurenative.deploymentmanager.outputs.RestResponseResponseRegex;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RestResponseResponse {
    private final @Nullable RestResponseResponseRegex regex;
    private final @Nullable List<String> successStatusCodes;

    @OutputCustomType.Constructor({"regex","successStatusCodes"})
    private RestResponseResponse(
        @Nullable RestResponseResponseRegex regex,
        @Nullable List<String> successStatusCodes) {
        this.regex = regex;
        this.successStatusCodes = successStatusCodes;
    }

    public Optional<RestResponseResponseRegex> getRegex() {
        return Optional.ofNullable(this.regex);
    }
    public List<String> getSuccessStatusCodes() {
        return this.successStatusCodes == null ? List.of() : this.successStatusCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RestResponseResponseRegex regex;
        private @Nullable List<String> successStatusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(RestResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.successStatusCodes = defaults.successStatusCodes;
        }

        public Builder setRegex(@Nullable RestResponseResponseRegex regex) {
            this.regex = regex;
            return this;
        }

        public Builder setSuccessStatusCodes(@Nullable List<String> successStatusCodes) {
            this.successStatusCodes = successStatusCodes;
            return this;
        }

        public RestResponseResponse build() {
            return new RestResponseResponse(regex, successStatusCodes);
        }
    }
}
