// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListWebAppFunctionSecretsResult {
    private final @Nullable String key;
    private final @Nullable String triggerUrl;

    @OutputCustomType.Constructor({"key","triggerUrl"})
    private ListWebAppFunctionSecretsResult(
        @Nullable String key,
        @Nullable String triggerUrl) {
        this.key = key;
        this.triggerUrl = triggerUrl;
    }

    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> getTriggerUrl() {
        return Optional.ofNullable(this.triggerUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppFunctionSecretsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String triggerUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppFunctionSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.triggerUrl = defaults.triggerUrl;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setTriggerUrl(@Nullable String triggerUrl) {
            this.triggerUrl = triggerUrl;
            return this;
        }

        public ListWebAppFunctionSecretsResult build() {
            return new ListWebAppFunctionSecretsResult(key, triggerUrl);
        }
    }
}
