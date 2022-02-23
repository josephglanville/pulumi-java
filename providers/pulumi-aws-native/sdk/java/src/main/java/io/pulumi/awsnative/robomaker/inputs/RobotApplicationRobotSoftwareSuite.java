// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.inputs;

import io.pulumi.awsnative.robomaker.enums.RobotApplicationRobotSoftwareSuiteName;
import io.pulumi.awsnative.robomaker.enums.RobotApplicationRobotSoftwareSuiteVersion;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The robot software suite used by the robot application.
 * 
 */
public final class RobotApplicationRobotSoftwareSuite extends io.pulumi.resources.InvokeArgs {

    public static final RobotApplicationRobotSoftwareSuite Empty = new RobotApplicationRobotSoftwareSuite();

    /**
     * The name of robot software suite.
     * 
     */
    @InputImport(name="name", required=true)
      private final RobotApplicationRobotSoftwareSuiteName name;

    public RobotApplicationRobotSoftwareSuiteName getName() {
        return this.name;
    }

    /**
     * The version of robot software suite.
     * 
     */
    @InputImport(name="version")
      private final @Nullable RobotApplicationRobotSoftwareSuiteVersion version;

    public Optional<RobotApplicationRobotSoftwareSuiteVersion> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public RobotApplicationRobotSoftwareSuite(
        RobotApplicationRobotSoftwareSuiteName name,
        @Nullable RobotApplicationRobotSoftwareSuiteVersion version) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = version;
    }

    private RobotApplicationRobotSoftwareSuite() {
        this.name = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RobotApplicationRobotSoftwareSuite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RobotApplicationRobotSoftwareSuiteName name;
        private @Nullable RobotApplicationRobotSoftwareSuiteVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(RobotApplicationRobotSoftwareSuite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(RobotApplicationRobotSoftwareSuiteName name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVersion(@Nullable RobotApplicationRobotSoftwareSuiteVersion version) {
            this.version = version;
            return this;
        }
        public RobotApplicationRobotSoftwareSuite build() {
            return new RobotApplicationRobotSoftwareSuite(name, version);
        }
    }
}
