// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.deploymentmanager_alpha.enums.DiagnosticLevel;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiagnosticArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiagnosticArgs Empty = new DiagnosticArgs();

    /**
     * JsonPath expression on the resource that if non empty, indicates that this field needs to be extracted as a diagnostic.
     * 
     */
    @Import(name="field")
      private final @Nullable Output<String> field;

    public Output<String> getField() {
        return this.field == null ? Output.empty() : this.field;
    }

    /**
     * Level to record this diagnostic.
     * 
     */
    @Import(name="level")
      private final @Nullable Output<DiagnosticLevel> level;

    public Output<DiagnosticLevel> getLevel() {
        return this.level == null ? Output.empty() : this.level;
    }

    public DiagnosticArgs(
        @Nullable Output<String> field,
        @Nullable Output<DiagnosticLevel> level) {
        this.field = field;
        this.level = level;
    }

    private DiagnosticArgs() {
        this.field = Output.empty();
        this.level = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> field;
        private @Nullable Output<DiagnosticLevel> level;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.level = defaults.level;
        }

        public Builder field(@Nullable Output<String> field) {
            this.field = field;
            return this;
        }
        public Builder field(@Nullable String field) {
            this.field = Output.ofNullable(field);
            return this;
        }
        public Builder level(@Nullable Output<DiagnosticLevel> level) {
            this.level = level;
            return this;
        }
        public Builder level(@Nullable DiagnosticLevel level) {
            this.level = Output.ofNullable(level);
            return this;
        }        public DiagnosticArgs build() {
            return new DiagnosticArgs(field, level);
        }
    }
}
