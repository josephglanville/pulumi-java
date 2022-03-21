// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.ScriptsToExecuteResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of customized scripts to execute for setting up the cluster.
 * 
 */
public final class SetupScriptsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SetupScriptsResponse Empty = new SetupScriptsResponse();

    /**
     * Customized setup scripts
     * 
     */
    @Import(name="scripts")
      private final @Nullable ScriptsToExecuteResponse scripts;

    public Optional<ScriptsToExecuteResponse> getScripts() {
        return this.scripts == null ? Optional.empty() : Optional.ofNullable(this.scripts);
    }

    public SetupScriptsResponse(@Nullable ScriptsToExecuteResponse scripts) {
        this.scripts = scripts;
    }

    private SetupScriptsResponse() {
        this.scripts = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SetupScriptsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ScriptsToExecuteResponse scripts;

        public Builder() {
    	      // Empty
        }

        public Builder(SetupScriptsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scripts = defaults.scripts;
        }

        public Builder scripts(@Nullable ScriptsToExecuteResponse scripts) {
            this.scripts = scripts;
            return this;
        }        public SetupScriptsResponse build() {
            return new SetupScriptsResponse(scripts);
        }
    }
}
