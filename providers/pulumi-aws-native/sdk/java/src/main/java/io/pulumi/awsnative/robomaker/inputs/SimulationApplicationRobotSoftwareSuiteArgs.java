// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.inputs;

import io.pulumi.awsnative.robomaker.enums.SimulationApplicationRobotSoftwareSuiteName;
import io.pulumi.awsnative.robomaker.enums.SimulationApplicationRobotSoftwareSuiteVersion;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about a robot software suite.
 * 
 */
public final class SimulationApplicationRobotSoftwareSuiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final SimulationApplicationRobotSoftwareSuiteArgs Empty = new SimulationApplicationRobotSoftwareSuiteArgs();

    /**
     * The name of the robot software suite.
     * 
     */
    @Import(name="name", required=true)
      private final Output<SimulationApplicationRobotSoftwareSuiteName> name;

    public Output<SimulationApplicationRobotSoftwareSuiteName> getName() {
        return this.name;
    }

    /**
     * The version of the robot software suite.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<SimulationApplicationRobotSoftwareSuiteVersion> version;

    public Output<SimulationApplicationRobotSoftwareSuiteVersion> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public SimulationApplicationRobotSoftwareSuiteArgs(
        Output<SimulationApplicationRobotSoftwareSuiteName> name,
        @Nullable Output<SimulationApplicationRobotSoftwareSuiteVersion> version) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = version;
    }

    private SimulationApplicationRobotSoftwareSuiteArgs() {
        this.name = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimulationApplicationRobotSoftwareSuiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SimulationApplicationRobotSoftwareSuiteName> name;
        private @Nullable Output<SimulationApplicationRobotSoftwareSuiteVersion> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SimulationApplicationRobotSoftwareSuiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder name(Output<SimulationApplicationRobotSoftwareSuiteName> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(SimulationApplicationRobotSoftwareSuiteName name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder version(@Nullable Output<SimulationApplicationRobotSoftwareSuiteVersion> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable SimulationApplicationRobotSoftwareSuiteVersion version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public SimulationApplicationRobotSoftwareSuiteArgs build() {
            return new SimulationApplicationRobotSoftwareSuiteArgs(name, version);
        }
    }
}
