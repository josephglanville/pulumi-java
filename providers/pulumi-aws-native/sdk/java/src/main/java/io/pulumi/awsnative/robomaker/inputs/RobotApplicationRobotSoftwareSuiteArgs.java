// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.inputs;

import io.pulumi.awsnative.robomaker.enums.RobotApplicationRobotSoftwareSuiteName;
import io.pulumi.awsnative.robomaker.enums.RobotApplicationRobotSoftwareSuiteVersion;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The robot software suite used by the robot application.
 * 
 */
public final class RobotApplicationRobotSoftwareSuiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RobotApplicationRobotSoftwareSuiteArgs Empty = new RobotApplicationRobotSoftwareSuiteArgs();

    /**
     * The name of robot software suite.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<RobotApplicationRobotSoftwareSuiteName> name;

    public Input<RobotApplicationRobotSoftwareSuiteName> getName() {
        return this.name;
    }

    /**
     * The version of robot software suite.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<RobotApplicationRobotSoftwareSuiteVersion> version;

    public Input<RobotApplicationRobotSoftwareSuiteVersion> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public RobotApplicationRobotSoftwareSuiteArgs(
        Input<RobotApplicationRobotSoftwareSuiteName> name,
        @Nullable Input<RobotApplicationRobotSoftwareSuiteVersion> version) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = version;
    }

    private RobotApplicationRobotSoftwareSuiteArgs() {
        this.name = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RobotApplicationRobotSoftwareSuiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RobotApplicationRobotSoftwareSuiteName> name;
        private @Nullable Input<RobotApplicationRobotSoftwareSuiteVersion> version;

        public Builder() {
    	      // Empty
        }

        public Builder(RobotApplicationRobotSoftwareSuiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(Input<RobotApplicationRobotSoftwareSuiteName> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(RobotApplicationRobotSoftwareSuiteName name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setVersion(@Nullable Input<RobotApplicationRobotSoftwareSuiteVersion> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable RobotApplicationRobotSoftwareSuiteVersion version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public RobotApplicationRobotSoftwareSuiteArgs build() {
            return new RobotApplicationRobotSoftwareSuiteArgs(name, version);
        }
    }
}
