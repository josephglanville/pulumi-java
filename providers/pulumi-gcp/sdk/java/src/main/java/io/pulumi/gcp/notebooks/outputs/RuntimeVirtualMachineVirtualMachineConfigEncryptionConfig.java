// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig {
    private final @Nullable String kmsKey;

    @OutputCustomType.Constructor({"kmsKey"})
    private RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig(@Nullable String kmsKey) {
        this.kmsKey = kmsKey;
    }

    public Optional<String> getKmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder setKmsKey(@Nullable String kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig build() {
            return new RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig(kmsKey);
        }
    }
}