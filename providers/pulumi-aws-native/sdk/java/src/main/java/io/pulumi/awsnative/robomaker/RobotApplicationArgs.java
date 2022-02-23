// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker;

import io.pulumi.awsnative.robomaker.inputs.RobotApplicationRobotSoftwareSuiteArgs;
import io.pulumi.awsnative.robomaker.inputs.RobotApplicationSourceConfigArgs;
import io.pulumi.awsnative.robomaker.inputs.RobotApplicationTagsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RobotApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RobotApplicationArgs Empty = new RobotApplicationArgs();

    /**
     * The revision ID of robot application.
     * 
     */
    @InputImport(name="currentRevisionId")
      private final @Nullable Input<String> currentRevisionId;

    public Input<String> getCurrentRevisionId() {
        return this.currentRevisionId == null ? Input.empty() : this.currentRevisionId;
    }

    /**
     * The URI of the Docker image for the robot application.
     * 
     */
    @InputImport(name="environment")
      private final @Nullable Input<String> environment;

    public Input<String> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    /**
     * The name of the robot application.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="robotSoftwareSuite", required=true)
      private final Input<RobotApplicationRobotSoftwareSuiteArgs> robotSoftwareSuite;

    public Input<RobotApplicationRobotSoftwareSuiteArgs> getRobotSoftwareSuite() {
        return this.robotSoftwareSuite;
    }

    /**
     * The sources of the robot application.
     * 
     */
    @InputImport(name="sources")
      private final @Nullable Input<List<RobotApplicationSourceConfigArgs>> sources;

    public Input<List<RobotApplicationSourceConfigArgs>> getSources() {
        return this.sources == null ? Input.empty() : this.sources;
    }

    @InputImport(name="tags")
      private final @Nullable Input<RobotApplicationTagsArgs> tags;

    public Input<RobotApplicationTagsArgs> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RobotApplicationArgs(
        @Nullable Input<String> currentRevisionId,
        @Nullable Input<String> environment,
        @Nullable Input<String> name,
        Input<RobotApplicationRobotSoftwareSuiteArgs> robotSoftwareSuite,
        @Nullable Input<List<RobotApplicationSourceConfigArgs>> sources,
        @Nullable Input<RobotApplicationTagsArgs> tags) {
        this.currentRevisionId = currentRevisionId;
        this.environment = environment;
        this.name = name;
        this.robotSoftwareSuite = Objects.requireNonNull(robotSoftwareSuite, "expected parameter 'robotSoftwareSuite' to be non-null");
        this.sources = sources;
        this.tags = tags;
    }

    private RobotApplicationArgs() {
        this.currentRevisionId = Input.empty();
        this.environment = Input.empty();
        this.name = Input.empty();
        this.robotSoftwareSuite = Input.empty();
        this.sources = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RobotApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> currentRevisionId;
        private @Nullable Input<String> environment;
        private @Nullable Input<String> name;
        private Input<RobotApplicationRobotSoftwareSuiteArgs> robotSoftwareSuite;
        private @Nullable Input<List<RobotApplicationSourceConfigArgs>> sources;
        private @Nullable Input<RobotApplicationTagsArgs> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RobotApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentRevisionId = defaults.currentRevisionId;
    	      this.environment = defaults.environment;
    	      this.name = defaults.name;
    	      this.robotSoftwareSuite = defaults.robotSoftwareSuite;
    	      this.sources = defaults.sources;
    	      this.tags = defaults.tags;
        }

        public Builder setCurrentRevisionId(@Nullable Input<String> currentRevisionId) {
            this.currentRevisionId = currentRevisionId;
            return this;
        }

        public Builder setCurrentRevisionId(@Nullable String currentRevisionId) {
            this.currentRevisionId = Input.ofNullable(currentRevisionId);
            return this;
        }

        public Builder setEnvironment(@Nullable Input<String> environment) {
            this.environment = environment;
            return this;
        }

        public Builder setEnvironment(@Nullable String environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRobotSoftwareSuite(Input<RobotApplicationRobotSoftwareSuiteArgs> robotSoftwareSuite) {
            this.robotSoftwareSuite = Objects.requireNonNull(robotSoftwareSuite);
            return this;
        }

        public Builder setRobotSoftwareSuite(RobotApplicationRobotSoftwareSuiteArgs robotSoftwareSuite) {
            this.robotSoftwareSuite = Input.of(Objects.requireNonNull(robotSoftwareSuite));
            return this;
        }

        public Builder setSources(@Nullable Input<List<RobotApplicationSourceConfigArgs>> sources) {
            this.sources = sources;
            return this;
        }

        public Builder setSources(@Nullable List<RobotApplicationSourceConfigArgs> sources) {
            this.sources = Input.ofNullable(sources);
            return this;
        }

        public Builder setTags(@Nullable Input<RobotApplicationTagsArgs> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable RobotApplicationTagsArgs tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public RobotApplicationArgs build() {
            return new RobotApplicationArgs(currentRevisionId, environment, name, robotSoftwareSuite, sources, tags);
        }
    }
}
