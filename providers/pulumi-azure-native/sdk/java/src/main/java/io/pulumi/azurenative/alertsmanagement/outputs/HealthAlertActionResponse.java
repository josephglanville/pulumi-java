// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HealthAlertActionResponse {
    private final @Nullable String actionGroupId;
    private final @Nullable Map<String,String> webHookProperties;

    @OutputCustomType.Constructor({"actionGroupId","webHookProperties"})
    private HealthAlertActionResponse(
        @Nullable String actionGroupId,
        @Nullable Map<String,String> webHookProperties) {
        this.actionGroupId = actionGroupId;
        this.webHookProperties = webHookProperties;
    }

    public Optional<String> getActionGroupId() {
        return Optional.ofNullable(this.actionGroupId);
    }
    public Map<String,String> getWebHookProperties() {
        return this.webHookProperties == null ? Map.of() : this.webHookProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthAlertActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionGroupId;
        private @Nullable Map<String,String> webHookProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthAlertActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupId = defaults.actionGroupId;
    	      this.webHookProperties = defaults.webHookProperties;
        }

        public Builder setActionGroupId(@Nullable String actionGroupId) {
            this.actionGroupId = actionGroupId;
            return this;
        }

        public Builder setWebHookProperties(@Nullable Map<String,String> webHookProperties) {
            this.webHookProperties = webHookProperties;
            return this;
        }

        public HealthAlertActionResponse build() {
            return new HealthAlertActionResponse(actionGroupId, webHookProperties);
        }
    }
}
