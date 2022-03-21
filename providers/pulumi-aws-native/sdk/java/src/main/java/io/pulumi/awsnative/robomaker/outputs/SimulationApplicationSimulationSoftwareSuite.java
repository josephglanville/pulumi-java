// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.outputs;

import io.pulumi.awsnative.robomaker.enums.SimulationApplicationSimulationSoftwareSuiteName;
import io.pulumi.awsnative.robomaker.enums.SimulationApplicationSimulationSoftwareSuiteVersion;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SimulationApplicationSimulationSoftwareSuite {
    /**
     * The name of the simulation software suite.
     * 
     */
    private final SimulationApplicationSimulationSoftwareSuiteName name;
    /**
     * The version of the simulation software suite.
     * 
     */
    private final @Nullable SimulationApplicationSimulationSoftwareSuiteVersion version;

    @CustomType.Constructor
    private SimulationApplicationSimulationSoftwareSuite(
        @CustomType.Parameter("name") SimulationApplicationSimulationSoftwareSuiteName name,
        @CustomType.Parameter("version") @Nullable SimulationApplicationSimulationSoftwareSuiteVersion version) {
        this.name = name;
        this.version = version;
    }

    /**
     * The name of the simulation software suite.
     * 
    */
    public SimulationApplicationSimulationSoftwareSuiteName getName() {
        return this.name;
    }
    /**
     * The version of the simulation software suite.
     * 
    */
    public Optional<SimulationApplicationSimulationSoftwareSuiteVersion> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimulationApplicationSimulationSoftwareSuite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SimulationApplicationSimulationSoftwareSuiteName name;
        private @Nullable SimulationApplicationSimulationSoftwareSuiteVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(SimulationApplicationSimulationSoftwareSuite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder name(SimulationApplicationSimulationSoftwareSuiteName name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder version(@Nullable SimulationApplicationSimulationSoftwareSuiteVersion version) {
            this.version = version;
            return this;
        }        public SimulationApplicationSimulationSoftwareSuite build() {
            return new SimulationApplicationSimulationSoftwareSuite(name, version);
        }
    }
}
