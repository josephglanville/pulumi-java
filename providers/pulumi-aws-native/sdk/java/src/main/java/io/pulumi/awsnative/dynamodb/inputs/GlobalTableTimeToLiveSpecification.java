// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalTableTimeToLiveSpecification extends io.pulumi.resources.InvokeArgs {

    public static final GlobalTableTimeToLiveSpecification Empty = new GlobalTableTimeToLiveSpecification();

    @Import(name="attributeName")
      private final @Nullable String attributeName;

    public Optional<String> getAttributeName() {
        return this.attributeName == null ? Optional.empty() : Optional.ofNullable(this.attributeName);
    }

    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public GlobalTableTimeToLiveSpecification(
        @Nullable String attributeName,
        Boolean enabled) {
        this.attributeName = attributeName;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private GlobalTableTimeToLiveSpecification() {
        this.attributeName = null;
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableTimeToLiveSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String attributeName;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableTimeToLiveSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.enabled = defaults.enabled;
        }

        public Builder attributeName(@Nullable String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public GlobalTableTimeToLiveSpecification build() {
            return new GlobalTableTimeToLiveSpecification(attributeName, enabled);
        }
    }
}
