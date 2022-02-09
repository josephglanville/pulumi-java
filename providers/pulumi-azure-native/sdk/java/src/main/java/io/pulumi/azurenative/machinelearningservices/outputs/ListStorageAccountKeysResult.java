// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListStorageAccountKeysResult {
    private final String userStorageKey;

    @OutputCustomType.Constructor({"userStorageKey"})
    private ListStorageAccountKeysResult(String userStorageKey) {
        this.userStorageKey = Objects.requireNonNull(userStorageKey);
    }

    public String getUserStorageKey() {
        return this.userStorageKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStorageAccountKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String userStorageKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStorageAccountKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userStorageKey = defaults.userStorageKey;
        }

        public Builder setUserStorageKey(String userStorageKey) {
            this.userStorageKey = Objects.requireNonNull(userStorageKey);
            return this;
        }

        public ListStorageAccountKeysResult build() {
            return new ListStorageAccountKeysResult(userStorageKey);
        }
    }
}
