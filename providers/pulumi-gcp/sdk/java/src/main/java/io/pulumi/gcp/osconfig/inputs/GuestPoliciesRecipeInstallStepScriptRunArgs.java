// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeInstallStepScriptRunArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeInstallStepScriptRunArgs Empty = new GuestPoliciesRecipeInstallStepScriptRunArgs();

    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    @Import(name="allowedExitCodes")
      private final @Nullable Output<List<Integer>> allowedExitCodes;

    public Output<List<Integer>> getAllowedExitCodes() {
        return this.allowedExitCodes == null ? Output.empty() : this.allowedExitCodes;
    }

    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script is executed directly,
     * which likely only succeed for scripts with shebang lines.
     * Possible values are `SHELL` and `POWERSHELL`.
     * 
     */
    @Import(name="interpreter")
      private final @Nullable Output<String> interpreter;

    public Output<String> getInterpreter() {
        return this.interpreter == null ? Output.empty() : this.interpreter;
    }

    /**
     * The shell script to be executed.
     * 
     */
    @Import(name="script", required=true)
      private final Output<String> script;

    public Output<String> getScript() {
        return this.script;
    }

    public GuestPoliciesRecipeInstallStepScriptRunArgs(
        @Nullable Output<List<Integer>> allowedExitCodes,
        @Nullable Output<String> interpreter,
        Output<String> script) {
        this.allowedExitCodes = allowedExitCodes;
        this.interpreter = interpreter;
        this.script = Objects.requireNonNull(script, "expected parameter 'script' to be non-null");
    }

    private GuestPoliciesRecipeInstallStepScriptRunArgs() {
        this.allowedExitCodes = Output.empty();
        this.interpreter = Output.empty();
        this.script = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeInstallStepScriptRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Integer>> allowedExitCodes;
        private @Nullable Output<String> interpreter;
        private Output<String> script;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeInstallStepScriptRunArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.interpreter = defaults.interpreter;
    	      this.script = defaults.script;
        }

        public Builder allowedExitCodes(@Nullable Output<List<Integer>> allowedExitCodes) {
            this.allowedExitCodes = allowedExitCodes;
            return this;
        }
        public Builder allowedExitCodes(@Nullable List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Output.ofNullable(allowedExitCodes);
            return this;
        }
        public Builder allowedExitCodes(Integer... allowedExitCodes) {
            return allowedExitCodes(List.of(allowedExitCodes));
        }
        public Builder interpreter(@Nullable Output<String> interpreter) {
            this.interpreter = interpreter;
            return this;
        }
        public Builder interpreter(@Nullable String interpreter) {
            this.interpreter = Output.ofNullable(interpreter);
            return this;
        }
        public Builder script(Output<String> script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }
        public Builder script(String script) {
            this.script = Output.of(Objects.requireNonNull(script));
            return this;
        }        public GuestPoliciesRecipeInstallStepScriptRunArgs build() {
            return new GuestPoliciesRecipeInstallStepScriptRunArgs(allowedExitCodes, interpreter, script);
        }
    }
}
