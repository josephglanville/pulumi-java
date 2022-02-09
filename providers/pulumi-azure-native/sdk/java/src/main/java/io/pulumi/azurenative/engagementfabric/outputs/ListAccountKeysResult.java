// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.engagementfabric.outputs;

import io.pulumi.azurenative.engagementfabric.outputs.KeyDescriptionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ListAccountKeysResult {
    private final List<KeyDescriptionResponse> value;

    @OutputCustomType.Constructor({"value"})
    private ListAccountKeysResult(List<KeyDescriptionResponse> value) {
        this.value = Objects.requireNonNull(value);
    }

    public List<KeyDescriptionResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAccountKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<KeyDescriptionResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAccountKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(List<KeyDescriptionResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public ListAccountKeysResult build() {
            return new ListAccountKeysResult(value);
        }
    }
}
