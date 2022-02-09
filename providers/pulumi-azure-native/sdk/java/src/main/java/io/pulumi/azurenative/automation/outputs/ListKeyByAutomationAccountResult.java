// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.KeyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListKeyByAutomationAccountResult {
    private final @Nullable List<KeyResponse> keys;

    @OutputCustomType.Constructor({"keys"})
    private ListKeyByAutomationAccountResult(@Nullable List<KeyResponse> keys) {
        this.keys = keys;
    }

    public List<KeyResponse> getKeys() {
        return this.keys == null ? List.of() : this.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListKeyByAutomationAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<KeyResponse> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(ListKeyByAutomationAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
        }

        public Builder setKeys(@Nullable List<KeyResponse> keys) {
            this.keys = keys;
            return this;
        }

        public ListKeyByAutomationAccountResult build() {
            return new ListKeyByAutomationAccountResult(keys);
        }
    }
}
