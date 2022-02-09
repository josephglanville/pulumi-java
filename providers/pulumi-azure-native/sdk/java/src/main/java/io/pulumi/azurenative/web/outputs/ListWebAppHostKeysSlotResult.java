// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListWebAppHostKeysSlotResult {
    private final @Nullable Map<String,String> functionKeys;
    private final @Nullable String masterKey;
    private final @Nullable Map<String,String> systemKeys;

    @OutputCustomType.Constructor({"functionKeys","masterKey","systemKeys"})
    private ListWebAppHostKeysSlotResult(
        @Nullable Map<String,String> functionKeys,
        @Nullable String masterKey,
        @Nullable Map<String,String> systemKeys) {
        this.functionKeys = functionKeys;
        this.masterKey = masterKey;
        this.systemKeys = systemKeys;
    }

    public Map<String,String> getFunctionKeys() {
        return this.functionKeys == null ? Map.of() : this.functionKeys;
    }
    public Optional<String> getMasterKey() {
        return Optional.ofNullable(this.masterKey);
    }
    public Map<String,String> getSystemKeys() {
        return this.systemKeys == null ? Map.of() : this.systemKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppHostKeysSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> functionKeys;
        private @Nullable String masterKey;
        private @Nullable Map<String,String> systemKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppHostKeysSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionKeys = defaults.functionKeys;
    	      this.masterKey = defaults.masterKey;
    	      this.systemKeys = defaults.systemKeys;
        }

        public Builder setFunctionKeys(@Nullable Map<String,String> functionKeys) {
            this.functionKeys = functionKeys;
            return this;
        }

        public Builder setMasterKey(@Nullable String masterKey) {
            this.masterKey = masterKey;
            return this;
        }

        public Builder setSystemKeys(@Nullable Map<String,String> systemKeys) {
            this.systemKeys = systemKeys;
            return this;
        }

        public ListWebAppHostKeysSlotResult build() {
            return new ListWebAppHostKeysSlotResult(functionKeys, masterKey, systemKeys);
        }
    }
}
