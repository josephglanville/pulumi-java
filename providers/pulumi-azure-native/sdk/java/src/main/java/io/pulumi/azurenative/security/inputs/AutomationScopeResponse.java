// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomationScopeResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomationScopeResponse Empty = new AutomationScopeResponse();

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="scopePath")
    private final @Nullable String scopePath;

    public Optional<String> getScopePath() {
        return this.scopePath == null ? Optional.empty() : Optional.ofNullable(this.scopePath);
    }

    public AutomationScopeResponse(
        @Nullable String description,
        @Nullable String scopePath) {
        this.description = description;
        this.scopePath = scopePath;
    }

    private AutomationScopeResponse() {
        this.description = null;
        this.scopePath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String scopePath;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationScopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.scopePath = defaults.scopePath;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setScopePath(@Nullable String scopePath) {
            this.scopePath = scopePath;
            return this;
        }

        public AutomationScopeResponse build() {
            return new AutomationScopeResponse(description, scopePath);
        }
    }
}
