// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionImageConfig {
    /**
     * Parameters that you want to pass in with `entry_point`.
     * 
     */
    private final @Nullable List<String> commands;
    /**
     * Entry point to your application, which is typically the location of the runtime executable.
     * 
     */
    private final @Nullable List<String> entryPoints;
    /**
     * Working directory.
     * 
     */
    private final @Nullable String workingDirectory;

    @CustomType.Constructor
    private FunctionImageConfig(
        @CustomType.Parameter("commands") @Nullable List<String> commands,
        @CustomType.Parameter("entryPoints") @Nullable List<String> entryPoints,
        @CustomType.Parameter("workingDirectory") @Nullable String workingDirectory) {
        this.commands = commands;
        this.entryPoints = entryPoints;
        this.workingDirectory = workingDirectory;
    }

    /**
     * Parameters that you want to pass in with `entry_point`.
     * 
    */
    public List<String> getCommands() {
        return this.commands == null ? List.of() : this.commands;
    }
    /**
     * Entry point to your application, which is typically the location of the runtime executable.
     * 
    */
    public List<String> getEntryPoints() {
        return this.entryPoints == null ? List.of() : this.entryPoints;
    }
    /**
     * Working directory.
     * 
    */
    public Optional<String> getWorkingDirectory() {
        return Optional.ofNullable(this.workingDirectory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionImageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> commands;
        private @Nullable List<String> entryPoints;
        private @Nullable String workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionImageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.entryPoints = defaults.entryPoints;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder commands(@Nullable List<String> commands) {
            this.commands = commands;
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        public Builder entryPoints(@Nullable List<String> entryPoints) {
            this.entryPoints = entryPoints;
            return this;
        }
        public Builder entryPoints(String... entryPoints) {
            return entryPoints(List.of(entryPoints));
        }
        public Builder workingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }        public FunctionImageConfig build() {
            return new FunctionImageConfig(commands, entryPoints, workingDirectory);
        }
    }
}
