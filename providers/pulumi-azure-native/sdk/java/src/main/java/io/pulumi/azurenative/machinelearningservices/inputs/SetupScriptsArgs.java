// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.ScriptsToExecuteArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SetupScriptsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SetupScriptsArgs Empty = new SetupScriptsArgs();

    @InputImport(name="scripts")
    private final @Nullable Input<ScriptsToExecuteArgs> scripts;

    public Input<ScriptsToExecuteArgs> getScripts() {
        return this.scripts == null ? Input.empty() : this.scripts;
    }

    public SetupScriptsArgs(@Nullable Input<ScriptsToExecuteArgs> scripts) {
        this.scripts = scripts;
    }

    private SetupScriptsArgs() {
        this.scripts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SetupScriptsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ScriptsToExecuteArgs> scripts;

        public Builder() {
    	      // Empty
        }

        public Builder(SetupScriptsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scripts = defaults.scripts;
        }

        public Builder setScripts(@Nullable Input<ScriptsToExecuteArgs> scripts) {
            this.scripts = scripts;
            return this;
        }

        public Builder setScripts(@Nullable ScriptsToExecuteArgs scripts) {
            this.scripts = Input.ofNullable(scripts);
            return this;
        }

        public SetupScriptsArgs build() {
            return new SetupScriptsArgs(scripts);
        }
    }
}
