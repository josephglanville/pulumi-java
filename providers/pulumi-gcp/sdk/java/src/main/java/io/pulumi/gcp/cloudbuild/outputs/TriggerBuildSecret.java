// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerBuildSecret {
    private final String kmsKeyName;
    private final @Nullable Map<String,String> secretEnv;

    @OutputCustomType.Constructor({"kmsKeyName","secretEnv"})
    private TriggerBuildSecret(
        String kmsKeyName,
        @Nullable Map<String,String> secretEnv) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
        this.secretEnv = secretEnv;
    }

    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    public Map<String,String> getSecretEnv() {
        return this.secretEnv == null ? Map.of() : this.secretEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;
        private @Nullable Map<String,String> secretEnv;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.secretEnv = defaults.secretEnv;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setSecretEnv(@Nullable Map<String,String> secretEnv) {
            this.secretEnv = secretEnv;
            return this;
        }

        public TriggerBuildSecret build() {
            return new TriggerBuildSecret(kmsKeyName, secretEnv);
        }
    }
}