// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerConfigFleetConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerConfigFleetConfigGetArgs Empty = new GameServerConfigFleetConfigGetArgs();

    /**
     * The fleet spec, which is sent to Agones to configure fleet.
     * The spec can be passed as inline json but it is recommended to use a file reference
     * instead. File references can contain the json or yaml format of the fleet spec. Eg:
     * * fleet_spec = jsonencode(yamldecode(file("fleet_configs.yaml")))
     * * fleet_spec = file("fleet_configs.json")
     *   The format of the spec can be found :
     *   `https://agones.dev/site/docs/reference/fleet/`.
     * 
     */
    @InputImport(name="fleetSpec", required=true)
      private final Output<String> fleetSpec;

    public Output<String> getFleetSpec() {
        return this.fleetSpec;
    }

    /**
     * The name of the ScalingConfig
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public GameServerConfigFleetConfigGetArgs(
        Output<String> fleetSpec,
        @Nullable Output<String> name) {
        this.fleetSpec = Objects.requireNonNull(fleetSpec, "expected parameter 'fleetSpec' to be non-null");
        this.name = name;
    }

    private GameServerConfigFleetConfigGetArgs() {
        this.fleetSpec = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerConfigFleetConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> fleetSpec;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerConfigFleetConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetSpec = defaults.fleetSpec;
    	      this.name = defaults.name;
        }

        public Builder fleetSpec(Output<String> fleetSpec) {
            this.fleetSpec = Objects.requireNonNull(fleetSpec);
            return this;
        }

        public Builder fleetSpec(String fleetSpec) {
            this.fleetSpec = Output.of(Objects.requireNonNull(fleetSpec));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public GameServerConfigFleetConfigGetArgs build() {
            return new GameServerConfigFleetConfigGetArgs(fleetSpec, name);
        }
    }
}
