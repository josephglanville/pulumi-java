// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CodeConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final CodeConfigurationResponse Empty = new CodeConfigurationResponse();

    @InputImport(name="codeId")
    private final @Nullable String codeId;

    public Optional<String> getCodeId() {
        return this.codeId == null ? Optional.empty() : Optional.ofNullable(this.codeId);
    }

    @InputImport(name="scoringScript", required=true)
    private final String scoringScript;

    public String getScoringScript() {
        return this.scoringScript;
    }

    public CodeConfigurationResponse(
        @Nullable String codeId,
        String scoringScript) {
        this.codeId = codeId;
        this.scoringScript = Objects.requireNonNull(scoringScript, "expected parameter 'scoringScript' to be non-null");
    }

    private CodeConfigurationResponse() {
        this.codeId = null;
        this.scoringScript = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String codeId;
        private String scoringScript;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeId = defaults.codeId;
    	      this.scoringScript = defaults.scoringScript;
        }

        public Builder setCodeId(@Nullable String codeId) {
            this.codeId = codeId;
            return this;
        }

        public Builder setScoringScript(String scoringScript) {
            this.scoringScript = Objects.requireNonNull(scoringScript);
            return this;
        }

        public CodeConfigurationResponse build() {
            return new CodeConfigurationResponse(codeId, scoringScript);
        }
    }
}
