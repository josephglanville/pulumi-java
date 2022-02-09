// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.azurenative.devices.outputs.SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListIotDpsResourceKeysResult {
    private final String nextLink;
    private final @Nullable List<SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListIotDpsResourceKeysResult(
        String nextLink,
        @Nullable List<SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionResponse> value) {
        this.nextLink = Objects.requireNonNull(nextLink);
        this.value = value;
    }

    public String getNextLink() {
        return this.nextLink;
    }
    public List<SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIotDpsResourceKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private @Nullable List<SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIotDpsResourceKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }

        public Builder setValue(@Nullable List<SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionResponse> value) {
            this.value = value;
            return this;
        }

        public ListIotDpsResourceKeysResult build() {
            return new ListIotDpsResourceKeysResult(nextLink, value);
        }
    }
}
